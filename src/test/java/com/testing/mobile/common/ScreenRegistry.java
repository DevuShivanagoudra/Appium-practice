package com.testing.mobile.common;

import com.testing.mobile.common.screenFactory.IScreenFactory;
import com.testing.mobile.screens.BaseScreen;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScreenRegistry {
    private final Map<Class<?>, Object> screenObject = new HashMap<>();
    private IScreenFactory screenFactory = null;

    /**
     * Accepts screen class.
     *
     * @param screenClass screen class
     * @param <T>
     * @return T, the result of the provided class type
     */
    @SuppressWarnings("unchecked")
    public <T extends BaseScreen> T get(Class<T> screenClass) {
        if (!screenObject.containsKey(screenClass)) {
            final List<Method> methods = Arrays.stream(screenFactory.getClass()
                    .getMethods()).filter(method -> method.getReturnType() == screenClass).collect(Collectors.toList());
            if (methods.size() == 1) {
                try {
                    screenObject.put(screenClass, methods.get(0).invoke(screenFactory));
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                    throw new RuntimeException("ScreenRegistry invoke exception", exception);
                }
            } else if (methods.size() == 0) {
                throw new RuntimeException(String.format("No factory methods found for class: %s", screenClass));
            } else {
                throw new RuntimeException(String.format("Multiple factory methods found for class:%s", screenClass));
            }
        }
        return (T) screenObject.get(screenClass);
    }

    /**
     * Sets screen factory.
     *
     * @param screenFactory screen factory
     */
    public void setScreenFactory(final IScreenFactory screenFactory) {
        this.screenFactory = screenFactory;
        screenObject.clear();
    }
}

package me.tatarka.bindingconversiongeneric;

import java.util.List;

public class ViewModel<T> {

    public final List rawList;
    public final List<String> stringList;
    public final List<?> anyList;
    public final List<T> tList;

    @SuppressWarnings("unchecked")
    public ViewModel(List<T> list) {
        stringList = (List<String>) list;
        rawList = anyList = tList = list;
    }
}

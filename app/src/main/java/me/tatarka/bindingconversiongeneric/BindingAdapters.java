package me.tatarka.bindingconversiongeneric;

import android.databinding.BindingConversion;

import java.util.Iterator;
import java.util.List;

/**
 * Created by evan on 8/22/15.
 */
public class BindingAdapters {

    /**
     * A BindingConversion taking a raw type works
     */
    @BindingConversion
    public static String toString(List list) {
        StringBuilder builder = new StringBuilder();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            builder.append(itr.next());
            if (itr.hasNext()) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    /**
     * A BindingConversion taking a specific param type works
     */
    @BindingConversion
    public static String toStringGenericString(List<String> list) {
        return toString(list);
    }

    /**
     * A BindingConversion taking any type does _not_ work
     */
    @BindingConversion
    public static String toStringGenericAny(List<?> list) {
        return toString(list);
    }

    /**
     * A BindingConversion taking an explicit type param does _not_ work either
     */
    @BindingConversion
    public static <T> String toStringGenericT(List<T> list) {
        return toString(list);
    }
}

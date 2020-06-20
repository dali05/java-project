package enumCourse;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public enum SimpleEnum {
    pENUM1(Sets.newHashSet()),
    ENUM2(Sets.newHashSet()),
    ENUM3(Sets.newHashSet());

    private Set params;

    SimpleEnum(Set params) {
        this.params = params;
    }



    public Set getParams() {
        return params;
    }
}

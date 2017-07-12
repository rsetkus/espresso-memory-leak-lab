package lt.setkus.outofmemory.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Define an annotation for scoping to just an activity. Both the activity component and the
 * module's providers should be annotated with this same annotation to tie them together.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}

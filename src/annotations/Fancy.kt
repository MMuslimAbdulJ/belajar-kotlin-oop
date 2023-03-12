package annotations
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable()
@MustBeDocumented()
annotation class Fancy(val author : String)
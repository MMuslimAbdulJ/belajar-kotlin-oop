package annotations

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER
)
annotation class Beta

class ExampleTarget(
    @field:Beta val firstName : String,
    @param:Beta val middleName : String,
    @get:Beta val lastName : String
)
//package app
//
//import Exception.ValidationException
//import annotations.NotBlank
//import data.CreateCategoryRequest
//import data.CreateProductRequest
//
//fun validateRequest(request: Any) {
//    val clazz = request::class
//    val properties = clazz.memberProperties
//
//    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
//    for (property in properties) {
//        if (property.findAnnotation<NotBlank>() != null) {
//            when (val value = property.call(request)) {
//                is String -> {
//                    if ("" == value) {
//                        throw ValidationException("${property.name} is blank")
//                    }
//                }
//            }
//        }
//    }
//}
//
//fun main() {
//    val request = CreateProductRequest("1", "Indomie", 2000)
//    validateRequest(request)
//
//    val request2 = CreateCategoryRequest("F", "")
//    validateRequest(request2)
//}
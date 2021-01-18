package adamsar

import io.konform.validation.Validation

data class Test(val something: Int) {
    companion object {
        val validator = Validation<Test> {
            Test::something {
            }
        }
    }
}
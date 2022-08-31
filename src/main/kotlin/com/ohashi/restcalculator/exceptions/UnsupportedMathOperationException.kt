package com.ohashi.restcalculator.exceptions

import java.lang.RuntimeException

class UnsupportedMathOperationException(exception: String?) : RuntimeException(exception)

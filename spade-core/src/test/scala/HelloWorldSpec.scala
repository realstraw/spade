package com.salesforce.mce.spade

import org.scalatest.wordspec.AnyWordSpec

class HelloWorldSpec extends AnyWordSpec {
  "Hello World" when {
    "It runs" should {
      "do stuff" in {
        assert(1 + 1 === 2)
      }
    }
  }
}
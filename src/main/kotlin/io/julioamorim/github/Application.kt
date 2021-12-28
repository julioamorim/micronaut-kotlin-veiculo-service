package io.julioamorim.github

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("io.julioamorim.github")
		.start()
}


/**
 * https://www.codewars.com/kata/extract-file-name
 */
package kyu6

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("myFile.tar", extractFileName("1231231223123131_myFile.tar.gz2"))
}

fun extractFileName(dirtyFileName: String) = dirtyFileName.substringAfter("_").substringBeforeLast(".")

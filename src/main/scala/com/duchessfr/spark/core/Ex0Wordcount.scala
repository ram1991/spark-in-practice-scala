package com.duchessfr.spark.core

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD

/**
 *  The scala Spark API documentation: http://spark.apache.org/docs/latest/api/scala/index.html
 *
 *  Here the goal is to count how much each word appears in a file and make some operation on the result.
 *  We use the mapreduce pattern to do this:
 *
 *  step 1, the mapper:
 *  - we attribute 1 to each word. And we obtain then couples (word, 1), where word is the key.
 *
 *  step 2, the reducer:
 *  - for each key (=word), the values are added and we will obtain the total amount.
 *
 *  Use the Ex0WordcountSpec to implement the code.
 */
object Ex0Wordcount {

  val pathToFile = "data/wordcount.txt"

  /**
   *  Load the data from the text file and return an RDD of words
   */
  def loadData(): RDD[String] = {
    // create spark configuration and spark context
    val conf = new SparkConf()
                        .setAppName("Wordcount")
                        .setMaster("local[*]")

    val sc = new SparkContext(conf)

    // load data and create an RDD where each element will be a word
    // So you want to have a RDD[String]
    // Hint: use the Spark context and take a look at the textfile and flatMap methods
    // TODO write code here
    null
  }

  /**
   *  Now count how much each word appears!
   */
  def wordcount(): RDD[(String, Int)] = {
    val tweets = loadData

    // Step 1: the mapper step
    // The philosophy: we want to attribute the number 1 to each word: so we create couples (word, 1) using the Tuple2 class.
    // Hint: look at the mapToPair method
    // TODO write code here

    // Step 2: reducer step
    // The philosophy: now you have couple (key, value) where the key is a word, you want to aggregate the value for each word.
    // So you will use a reducer function.
    // Hint: the Spark API provides some reduce methods
    // TODO write code here
    null

  }

  /**
   *  Now keep the word which appear strictly more than 4 times!
   */
  def filterOnWordcount(): RDD[(String, Int)] = {
    val tweets = wordcount

    // Hint: the Spark API provides filter method
    // TODO write code here
    null
  }

}

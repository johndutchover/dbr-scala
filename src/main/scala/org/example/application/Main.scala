package org.example.application

import com.databricks.connect.DatabricksSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = DatabricksSession.builder().remote().getOrCreate()
    val df = spark.read.table("samples.nyctaxi.trips")
    df.limit(5).show()
  }
}

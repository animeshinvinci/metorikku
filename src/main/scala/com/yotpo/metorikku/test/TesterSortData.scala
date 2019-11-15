package com.yotpo.metorikku.test

case class TesterSortData(keys: List[String]) {

  def sortRows(a: RowObject, b: RowObject): Boolean = {
    for (colName <- keys) {
      if (a.row.get(colName) != b.row.get(colName)) {
        return a.row.getOrElse(colName, 0).hashCode() < b.row.getOrElse(colName, 0).hashCode()
      }
    }
    false
  }


  def sortRowsStr(a: Map[String, String], b: Map[String, String]): Boolean = {
    if (a.size != b.size) return false
    for (key <- a.keys) {
      if (a(key) != b(key)) {
        return a(key)< b(key)
      }
    }
    true
  }
}
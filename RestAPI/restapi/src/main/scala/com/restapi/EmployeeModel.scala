package com.restapi

import com.restapi.EmployeeModel.{Company, Name, OracleId}

import scala.util.Random

object EmployeeModel extends App{
  type Name = String
  type Company = String
  type OracleId = String
  final case class Id(value: String = Random.alphanumeric.take(8).foldLeft("")((result, c) => result + c))
  type Message = String
}
case class Employee(name: Name, company:Company)
case class EmployeeWithId(oracleid:OracleId,name: Name, company:Company)

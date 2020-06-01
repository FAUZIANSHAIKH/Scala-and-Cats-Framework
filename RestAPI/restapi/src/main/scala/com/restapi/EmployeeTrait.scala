package com.restapi
import cats.effect.IO
import com.restapi.EmployeeModel.Id
trait EmployeeTrait {
  def addEmployee(employee: Employee) : IO[Id]
  def getEmployee(oracleid: Id): IO[Option[EmployeeWithId]]
  def getEmployees(): IO[List[EmployeeWithId]]
}

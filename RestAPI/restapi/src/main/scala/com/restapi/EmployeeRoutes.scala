package com.restapi
import cats.effect.IO
import com.restapi.EmployeeModel.Id
import io.circe.Json
import io.circe.generic.auto._
import org.http4s.circe.CirceEntityCodec._
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

object EmployeeRoutes {
  def routes(employeeRepo: EmployeeTrait): HttpRoutes[IO] = {
    val dsl = new Http4sDsl[IO]{}
    import dsl._
    HttpRoutes.of[IO]{
      case _ @ GET -> Root / "employees" =>
        employeeRepo.getEmployees().flatMap(employees => Ok(employees))
      case req @POST -> Root / "employees" =>
        req.decode[Employee]{ employee =>
          employeeRepo.addEmployee(employee) flatMap(oracleid =>
            Created(Json.obj(("oracleid",Json.fromString(oracleid.value))))
            )
        }
      case _@ GET -> Root / "employees" /oracleid =>
        employeeRepo.getEmployee(Id(oracleid)) flatMap {
          case None => NotFound()
          case Some(employee) => Ok(employee)
        }

    }

  }
}

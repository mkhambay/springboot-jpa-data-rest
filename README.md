# springboot-jpa-data-rest
sample spring boot project that includes JPA, Spring Data REST

## Swagger API link
http://localhost:8080/swagger-ui.html

## HAL Browser link
http://localhost:8080/browser/index.html#/

## Spring Data REST with Paging and Sorting enabled
http://localhost:8080/driverrepo

Sample:
```
{
  "_embedded" : {
    "driverrepo" : [ {
      "firstName" : "Henry",
      "lastName" : "Williams",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/driverrepo/1"
        },
        "driver" : {
          "href" : "http://localhost:8080/driverrepo/1"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/driverrepo"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/driverrepo"
    },
    "search" : {
      "href" : "http://localhost:8080/driverrepo/search"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 1,
    "totalPages" : 1,
    "number" : 0
  }
}
```

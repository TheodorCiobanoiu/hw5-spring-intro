# hw5-spring-intro
```
For the filter: 
  -Use the /customers/view/filter/{filter}/{filterValue} path, where {filter} is the filter type you want
  -The filter value is for each cases: 
      -case "username": filter by the first letter in the username, so {filterValue} can be 'a','b','c', etc..
      -case "city": filter by city, so {filterValue} cand be 'Bucuresti", "Iasi" etc...
      -case "country: filter by country, so {filterValue} can be "Romania", "USA" etc...
      !! This is CASE SENSITIVE, so watch out how you give the parameters in the path
  -Use the customers/view/all to view all customers in DB (shows only the username)
  -Use the customers/view/{id} to view customer by id.
  ```

package ru.vol2hv;

import org.springframework.data.repository.CrudRepository;

//@RepositoryRestResource
//public interface CityRepository extends PagingAndSortingRepository<City, Integer>
public interface CityRepository extends CrudRepository<City, Integer> {
  //  List<City> findByName(String name);
}
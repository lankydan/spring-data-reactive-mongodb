package lankydan.tutorial.reactivestreams.repositories;

import lankydan.tutorial.reactivestreams.documents.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

  Flux<Person> findByFirstName(final String firstName);

  Mono<Person> findOneByFirstName(final String firstName);
}

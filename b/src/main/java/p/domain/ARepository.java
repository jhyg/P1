package p.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import p.domain.*;

@RepositoryRestResource(collectionResourceRel = "as", path = "as")
public interface ARepository extends PagingAndSortingRepository<A, Long> {}

package nextstep.subway.section.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Long> {
    boolean existsByName(final String name);
}
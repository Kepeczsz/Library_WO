package ZUT.meetingspot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingSpotRepository extends JpaRepository<MeetingSpot,Long> {
}

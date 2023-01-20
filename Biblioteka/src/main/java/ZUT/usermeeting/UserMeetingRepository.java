package ZUT.usermeeting;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMeetingRepository extends JpaRepository<UserMeeting,Long> {
}

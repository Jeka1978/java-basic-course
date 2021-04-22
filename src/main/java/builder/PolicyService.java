package builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

/**
 * @author Evgeny Borisov
 */
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PolicyService {


    @NonNull
    private Integer driverAge;
    @NonNull
    private Integer numberOfAccidence;
    @NonNull
    private Integer driverExperience;
    @NonNull
    private Integer x;


    public @NonNull Integer getDriverAge() {
        return this.driverAge;
    }

    public @NonNull Integer getNumberOfAccidence() {
        return this.numberOfAccidence;
    }

    public @NonNull Integer getDriverExperience() {
        return this.driverExperience;
    }

    public @NonNull Integer getX() {
        return this.x;
    }

    public void setDriverAge(@NonNull Integer driverAge) {
        this.driverAge = driverAge;
    }

    public void setNumberOfAccidence(@NonNull Integer numberOfAccidence) {
        this.numberOfAccidence = numberOfAccidence;
    }

    public void setDriverExperience(@NonNull Integer driverExperience) {
        this.driverExperience = driverExperience;
    }

    public void setX(@NonNull Integer x) {
        this.x = x;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolicyService)) return false;
        final PolicyService other = (PolicyService) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$driverAge = this.getDriverAge();
        final Object other$driverAge = other.getDriverAge();
        if (this$driverAge == null ? other$driverAge != null : !this$driverAge.equals(other$driverAge)) return false;
        final Object this$numberOfAccidence = this.getNumberOfAccidence();
        final Object other$numberOfAccidence = other.getNumberOfAccidence();
        if (this$numberOfAccidence == null ? other$numberOfAccidence != null : !this$numberOfAccidence.equals(other$numberOfAccidence))
            return false;
        final Object this$driverExperience = this.getDriverExperience();
        final Object other$driverExperience = other.getDriverExperience();
        if (this$driverExperience == null ? other$driverExperience != null : !this$driverExperience.equals(other$driverExperience))
            return false;
        final Object this$x = this.getX();
        final Object other$x = other.getX();
        if (this$x == null ? other$x != null : !this$x.equals(other$x)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PolicyService;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $driverAge = this.getDriverAge();
        result = result * PRIME + ($driverAge == null ? 43 : $driverAge.hashCode());
        final Object $numberOfAccidence = this.getNumberOfAccidence();
        result = result * PRIME + ($numberOfAccidence == null ? 43 : $numberOfAccidence.hashCode());
        final Object $driverExperience = this.getDriverExperience();
        result = result * PRIME + ($driverExperience == null ? 43 : $driverExperience.hashCode());
        final Object $x = this.getX();
        result = result * PRIME + ($x == null ? 43 : $x.hashCode());
        return result;
    }

    public String toString() {
        return "PolicyService(driverAge=" + this.getDriverAge() + ", numberOfAccidence=" + this.getNumberOfAccidence() + ", driverExperience=" + this.getDriverExperience() + ", x=" + this.getX() + ")";
    }
}

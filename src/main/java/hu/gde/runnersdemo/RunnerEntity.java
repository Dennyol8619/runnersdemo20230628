package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private long pace;
    private long shoeSize;

    @OneToMany(mappedBy = "runner")
    private List<LapTimeEntity> laptimes = new ArrayList<>();

    @ManyToOne
    private ShoeEntity shoe;

    public RunnerEntity() { }

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public long getPace() {
        return pace;
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setPace(long pace) {
        this.pace = pace;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }

    public long getShoeSize() {
        return shoeSize;
    }
    public void setShoeSize(long shoeSize) {
        this.shoeSize = shoeSize;
    }

    public ShoeEntity getShoe() { return shoe; }

    public void setShoe(ShoeEntity shoe) { this.shoe = shoe; }
}
package ex4.unit;

public class AlarmUnit {
    boolean alarm;


    public AlarmUnit(boolean alarmUnit) {
        this.alarm = alarmUnit;
    }

    public boolean isAlarmUnit() {
        return alarm;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "AlarmUnit{" +
                "alarmUnit=" + alarm +
                '}';
    }
}

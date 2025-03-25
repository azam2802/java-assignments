package TaskScheduler;

class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }
    
    public int compareTo(Task other) {
        if (this.priority == other.priority) {
            return Integer.compare(this.duration, other.duration);
        }
        return Integer.compare(other.priority, this.priority);
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
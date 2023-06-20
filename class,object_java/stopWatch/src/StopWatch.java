public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j]  = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000);
        }
        stopWatch.start();
        selectionSort(numbers);
        stopWatch.end();

        System.out.println("start time is " + stopWatch.getStartTime());
        System.out.println("end time is " + stopWatch.getEndTime());
        System.out.println(" run time is " + stopWatch.getElapsedTime());

    }
}

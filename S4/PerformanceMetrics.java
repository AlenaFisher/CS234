/*Lance Stott*/
class PerformanceMetrics {
    private double productivity;
    private double efficiency;
    private double quality;

    public void trackPerformance(double productivity, double efficiency, double quality) {
        this.productivity = productivity;
        this.efficiency = efficiency;
        this.quality = quality;
    }

    public double calculatePerformanceMetric() {
        return (productivity + efficiency + quality) / 3.0;
    }
}

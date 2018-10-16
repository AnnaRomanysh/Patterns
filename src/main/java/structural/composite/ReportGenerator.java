package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator implements Metrics {
    List<Metrics> metrics = new ArrayList<Metrics>();

    public void addMetric(Metrics metric) {
        metrics.add(metric);
    }

    public void removeMetric(Metrics metric) {
        metrics.remove(metric);
    }

    public void generateReport() {
        System.out.println("Generatiing report");
        for (Metrics me : metrics) {
            me.generateReport();
        }

    }
}

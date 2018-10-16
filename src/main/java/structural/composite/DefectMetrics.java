package structural.composite;

import java.util.ArrayList;
import java.util.List;

class DefectMetrics implements Metrics {

    List<Metrics> defectMatrices = new ArrayList<Metrics>();

    public void addDefectMatrix(Metrics defectMatrix) {
        defectMatrices.add(defectMatrix);

    }

    public void removeDefectMatrix(Metrics defectMatrix) {
        defectMatrices.remove(defectMatrix);

    }

    public void generateReport() {
        System.out.println("Generate defect matrix");
        for (Metrics matrix : defectMatrices) {
            matrix.generateReport();
        }

    }
}

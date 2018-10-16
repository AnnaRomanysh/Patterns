package structural.composite;

public class Usage {
    public static void main(String[] args) {
        TestCoverageMatrix testCoverage = new TestCoverageMatrix();
        TestEffectivenessMatrix testEffectiveness = new TestEffectivenessMatrix();


        DefectDistributionOverTime defectDistributionOverTime = new DefectDistributionOverTime();
        DefectsCreatedVsDefectsResolvedChart defectsCreatedVsDefectsResolvedChart = new DefectsCreatedVsDefectsResolvedChart();
        DefectMetrics defectMatrix = new DefectMetrics();
        defectMatrix.addDefectMatrix(defectDistributionOverTime);
        defectMatrix.addDefectMatrix(defectsCreatedVsDefectsResolvedChart);


        System.out.println("\n"+"*** Generate report for Lead QA ***");
        ReportGenerator reportForQAlead = new ReportGenerator();
        reportForQAlead.addMetric(testCoverage);
        reportForQAlead.generateReport();


        System.out.println("\n"+"*** Generate report for Project Manager ***");
        ReportGenerator reportForProgectManager = new ReportGenerator();
        reportForProgectManager.addMetric(testCoverage);
        reportForProgectManager.addMetric(testEffectiveness);
        reportForProgectManager.generateReport();


        System.out.println("\n"+"*** Generate report for Lead Developer ***");
        ReportGenerator reportForDeveloperLead = new ReportGenerator();
        reportForDeveloperLead.addMetric(defectMatrix);
        reportForDeveloperLead.generateReport();


        System.out.println("\n"+"*** Generate report for Developers Team ***");
        ReportGenerator reportForDevelopersTeam = new ReportGenerator();
        reportForDevelopersTeam.addMetric(defectsCreatedVsDefectsResolvedChart);
        reportForDevelopersTeam.generateReport();


    }
}

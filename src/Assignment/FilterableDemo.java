package Assignment;

// Q8: Filterable interface with ImageProcessor and DataAnalyzer

interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}

class ImageProcessor implements Filterable {

    @Override
    public void applyFilter(String filterType) {
        System.out.println("[ImageProcessor] Applying '" + filterType + "' filter to image.");
        System.out.println("  → Adjusting pixel values and color channels...");
    }

    @Override
    public void resetFilter() {
        System.out.println("[ImageProcessor] Resetting image to original state.");
        System.out.println("  → Restoring original pixel data from backup...");
    }
}

class DataAnalyzer implements Filterable {

    @Override
    public void applyFilter(String filterType) {
        System.out.println("[DataAnalyzer] Applying '" + filterType + "' filter to dataset.");
        System.out.println("  → Filtering rows based on criteria...");
    }

    @Override
    public void resetFilter() {
        System.out.println("[DataAnalyzer] Resetting dataset to unfiltered state.");
        System.out.println("  → Reloading original dataset...");
    }
}

public class FilterableDemo {
    public static void main(String[] args) {

        Filterable imgProcessor = new ImageProcessor();
        Filterable dataAnalyzer = new DataAnalyzer();

        System.out.println("=== Image Processing ===");
        imgProcessor.applyFilter("Grayscale");
        imgProcessor.applyFilter("Blur");
        imgProcessor.resetFilter();

        System.out.println();

        System.out.println("=== Data Analysis ===");
        dataAnalyzer.applyFilter("Date Range");
        dataAnalyzer.applyFilter("Category");
        dataAnalyzer.resetFilter();
    }
}

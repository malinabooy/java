package Sem.hw7;

public enum VacancyType {
    INTERN("Стажер"),
    DEVELOPER("Разработчик"),
    MANAGER("Менеджер");

    private String label;

    VacancyType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
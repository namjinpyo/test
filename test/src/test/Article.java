package test;

import java.io.Serializable;

/**
 * ����ȭ ������ Ŭ������ ����� ����  java.io.Serializable �������̽��� �����Ѵ�.
 */
class Article implements Serializable {
    private String title;
    private String pressName;
    private transient String reporterName;

    public Article(String title, String pressName, String reporterName) {
        this.title = title;
        this.pressName = pressName;
        this.reporterName = reporterName;
    }

    public String getTitle( ) { return title; }
    public String getpressName( ) { return pressName; }
    public String getreporterName( ) { return reporterName; }
    
    // ���� ������ȭ���� ���������� ��� �ʵ尡 �����Ǿ����� �� Ȯ���� ����! 
    @Override
    public String toString() {
        return String.format("title = %s, pressName = %s, reporterName = %s",
                title, pressName, reporterName);
    }
}


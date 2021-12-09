package test;

import java.io.Serializable;

/**
 * 직렬화 가능한 클래스로 만들기 위해  java.io.Serializable 인터페이스를 구현한다.
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
    
    // 차후 역직렬화에서 정상적으로 멤버 필드가 복원되었는지 값 확인을 위해! 
    @Override
    public String toString() {
        return String.format("title = %s, pressName = %s, reporterName = %s",
                title, pressName, reporterName);
    }
}


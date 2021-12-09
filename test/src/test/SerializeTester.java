package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

//직렬화 클래스인 Article은 위의 코드와 동일하다.
public class SerializeTester {
	public String serializeMethod() {
		Article article = new Article("직렬화는 무엇인가", "대한일보", "홍길동");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
     
		// 아래와 같은 형태의 try-with-resources 구문은 java 9 버전부터 지원한다.
		try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject(article);
		} catch (Exception e) {
			// ... 생략
		}
     
		// 바이트 배열로 생성된 데이터를 정상 출력하기 위해 base64 인코딩
		return Base64.getEncoder().encodeToString(bos.toByteArray());
	}
	
	public Article deserializeMethod(String serializedString) {
        // 앞선 직렬화에서 Base64 인코딩하였으므로 다시 디코딩한다.
        byte[] decodedData = Base64.getDecoder().decode(serializedString);
        ByteArrayInputStream bis = new ByteArrayInputStream(decodedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return (Article) ois.readObject();
        } catch (Exception e) {
            // ... 생략
        }
        return null;
    }

	public static void main(String[] args) {
		SerializeTester tester = new SerializeTester();
        String data = tester.serializeMethod();
        Article article = tester.deserializeMethod(data);
        
        // title = 직렬화는 무엇인가, pressName = 대한일보, reporterName = 홍길동
        System.out.println(article);
	}
}


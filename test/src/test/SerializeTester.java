package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

//����ȭ Ŭ������ Article�� ���� �ڵ�� �����ϴ�.
public class SerializeTester {
	public String serializeMethod() {
		Article article = new Article("����ȭ�� �����ΰ�", "�����Ϻ�", "ȫ�浿");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
     
		// �Ʒ��� ���� ������ try-with-resources ������ java 9 �������� �����Ѵ�.
		try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject(article);
		} catch (Exception e) {
			// ... ����
		}
     
		// ����Ʈ �迭�� ������ �����͸� ���� ����ϱ� ���� base64 ���ڵ�
		return Base64.getEncoder().encodeToString(bos.toByteArray());
	}
	
	public Article deserializeMethod(String serializedString) {
        // �ռ� ����ȭ���� Base64 ���ڵ��Ͽ����Ƿ� �ٽ� ���ڵ��Ѵ�.
        byte[] decodedData = Base64.getDecoder().decode(serializedString);
        ByteArrayInputStream bis = new ByteArrayInputStream(decodedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return (Article) ois.readObject();
        } catch (Exception e) {
            // ... ����
        }
        return null;
    }

	public static void main(String[] args) {
		SerializeTester tester = new SerializeTester();
        String data = tester.serializeMethod();
        Article article = tester.deserializeMethod(data);
        
        // title = ����ȭ�� �����ΰ�, pressName = �����Ϻ�, reporterName = ȫ�浿
        System.out.println(article);
	}
}


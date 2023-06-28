package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * 파일 업로드, 다운로드 관리 메서드
 * 
 * @author user
 *
 */
public class FileUtil {

	public static void download(HttpServletRequest req
							, HttpServletResponse res
							, String directory
							, String originalFileName
							, String saveFileName) {

		// 업로드 파일이 저장된 경로
		// String saveDirectory = "c:/upload";
		// 원본 파일이름
//		String originFileName = req.getParameter("oName");
//		// 저장된 파일이름
//		String saveFileName = req.getParameter("sName");

		System.out.print("originFileName : " + originalFileName + "<br>");
		System.out.print("saveFileName : " + saveFileName);

		try {

			File file = new File(directory, saveFileName);
			System.out.print("file : " + file);

			// 파일 입력 스트림 생성
			InputStream inStream = new FileInputStream(file);

			// 한글 파일명 깨짐 방지
			String client = req.getHeader("User-Agent");
			// ie 체크
			if (client.indexOf("WOW64") == -1) {
				originalFileName = new String(originalFileName.getBytes("UTF-8"), "ISO-8859-1");
			} else {
				originalFileName = new String(originalFileName.getBytes("KSC5601"), "ISO-8859-1");
			}

			// 파일 다운로드용 응답 헤더 설정
			res.reset();

			// 파일 다운로드 창을 띄우기 위한 콘텐츠 타입을 지정
			// octet-stream은 8비트 단위의 바이너리 데이터를 의미
			res.setContentType("application/octet-stream");

			res.setHeader("Content-Disposition", "attachment; filename=\"" + originalFileName + "\"");

			res.setHeader("Content-Length", "" + file.length());

//					// 출력 스트림 초기화
//					out.clear();
//					out = PageContext.pushBody();

			// response내장 객체로 부터 새로운 출력 스트림을 생성
			OutputStream outStream = res.getOutputStream();

			byte b[] = new byte[(int) file.length()];

			int readBuffer = 0;

			while ((readBuffer = inStream.read(b)) > 0) {
				outStream.write(b, 0, readBuffer);

			}

			// 입 / 출력 스트림 닫음;
			inStream.close();
			outStream.close();
		} catch (FileNotFoundException e) {

			JSFunction.alertBack(res, "파일을 찾을 수 없습니다.");

		} catch (Exception e) {

			JSFunction.alertBack(res, "파일 다운로드 중 오류가 발생 하였습니다.");
		}

	}
	
	/**
	 * 파일 업로드
	 * 파일 업로드(multipart/form-data 요청) 처리
	 * @return
	 */
	public static MultipartRequest uploadFile(
											HttpServletRequest req
											, String saveDirectory
											, int maxPostSize
											) {
		
		try {
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");	
		}catch (IOException e) {
			// 업로드 실패
			e.printStackTrace();
			return null;
		}
		
		 
	}

	/**
	 * 파일 삭제
	 */
	public static void deleteFile(String directiory, String filename) {
		File file = new File(directiory + File.separator + filename);
		
		// 파일이 존재 하면 제거
		if(file.exists()) {
			file.delete();
		}
		
	}
	
	/**
	 * 파일의 이름을 바꿔주는 메서드
	 * - 파일의 경로와 이름을 받아서 파일의 이름을 변경
	 * @return
	 */
	public static String fileNameChange(String saveDirectory,
											String fileName) {
		
	    
	    // 첨부파일의 확장자
	    String ext = fileName.substring(fileName.lastIndexOf("."));
	    
	    // H : 0~23, S : millisecond
	    // 현재시간을 파일이름으로 지정
	    String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
	    String oFileName = fileName.substring(0, fileName.lastIndexOf("."));
	    
	    String newFileName = oFileName +"_"+ now + ext;
	    System.out.println("원본파일명 : " + fileName);
	    System.out.println("신규파일명 : " + newFileName);
		
	 // 3. 파일명 변경
	    File oldFile = new File(saveDirectory + File.separator + fileName);
	    File newFile = new File(saveDirectory + File.separator + newFileName);
	    oldFile.renameTo(newFile);
	    
		return newFileName;
	    
	}
	
	public FileUtil() {

	}

}

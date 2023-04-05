package com.chap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_Buffer {

	public static void main(String[] args) {

		A_Buffer buffer = new A_Buffer();

		//buffer.filesave();
		buffer.fileRead();
	}

	public void fileRead() {

		try (FileReader fr = new FileReader("c_buffer.txt"); BufferedReader br = new BufferedReader(fr)) {

			String str = " ";

			while ((str = br.readLine()) != null) {

				System.out.println(str);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void filesave() {

		try (FileWriter fw = new FileWriter("c_buffer.txt", true); BufferedWriter bw = new BufferedWriter(fw)) {

			bw.newLine();
			bw.write("버퍼 테스트 중입니다.");
			bw.newLine();
			bw.write("잘되고 있을까요?");

			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

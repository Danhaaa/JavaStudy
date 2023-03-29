package phoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

   HashMap<String, HashMap<String, PhoneBookInfo>> phonebook =
		   new HashMap<>();
   
   
   public boolean addGroup(String groupName) { // 1. 새로운 그룹을 추가하는 메서드
	   if(!phonebook.containsKey(groupName)) {
		   phonebook.put(groupName, new HashMap<>()); // 그룹 하나당 해쉬맵 하나씩
		   System.out.printf("그룹 [%s]를 성공적으로 생성했습니다.\n", groupName);
     	return true;      
	   }
	   System.out.println("이미 존재하는 그룹입니다.\n");
	   	return false;
   }
   
   public boolean personAlreadyExistOtherGroup(PhoneBookInfo info) {
	   
	   boolean exist = false;
	   for(String groupName : phonebook.keySet()) { // 그룹이름을 하나씩 꺼내는 것
		   if(groupName.equals(info.group)) {
			   continue;
		   }
		   HashMap<String, PhoneBookInfo> groupMap = phonebook.get(groupName);
		   exist = exist || groupMap.containsKey(info.phoneNumber); 
	   }
	   
	   return exist;
   }
   	   
	public boolean addPerson(PhoneBookInfo info) {
		if(personAlreadyExistOtherGroup(info)) {
			System.out.println("다른 그룹에 이미 등록된 전화번호 입니다.");
			return false;
		}
		
		
		if (phonebook.containsKey(info.group)) {
			    HashMap<String, PhoneBookInfo> groupMap =
			  phonebook.get(info.group);
			         
		if (groupMap.containsKey(info.phoneNumber)) {  
			   System.out.printf("'%s'님의 정보를 수정했습니다.\n",
			                  info.name);
		} else {
			   System.out.println("새로운 정보를 등록했습니다.");
		}
			   groupMap.put(info.phoneNumber, info);
			   return true;
		}else {
			   System.out.println("해당 그룹이 존재하지 않아 추가 실패.");
			   return true;
		}
	}
	
	public void searchByName(String nameFrag) { 
		for(HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for(PhoneBookInfo info : group.values()) {
				if(info.name.contains(nameFrag)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void searchByPhoneNumber(String phoneNumerFrag) { // 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
		for(HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for(PhoneBookInfo info : group.values()) {
				if(info.phoneNumber.contains(phoneNumerFrag)) {
					System.out.println(info);
				}
			}
		}
	}

	public void printAll() {
		List<PhoneBookInfo> allInfo = new ArrayList<>();
		
		for(HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for(PhoneBookInfo info : group.values()) {
				allInfo.add(info);
			}
		}
		Collections.sort(allInfo, new Comparator<PhoneBookInfo>() { // 등록된 모든 정보를 그룹명 순으로 출력
			@Override
			public int compare(PhoneBookInfo i1,  PhoneBookInfo i2) {
				int r1 = i1.group.compareTo(i2.group);
				
				if(r1 == 0) {
					return i1.name.compareTo(i2.name);
				}else {
					return r1;
				}
			}
			
		});
		
		System.out.println("### Print All Info ###");
		for(PhoneBookInfo info : allInfo) {
			System.out.println(info);
		}
	}

}
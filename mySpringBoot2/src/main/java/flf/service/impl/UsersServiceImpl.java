package flf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flf.repository.UsersRepository;
import flf.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository bookRepository;
	
//	@Override
//	public List<Users> queryAllList() {
//		return bookRepository.findAll();
//	}
//
//	@Override
//	public List<Users> querySomeList() {
//		List<Users> list = new ArrayList<Users>();
//		List<Map<String, Object>>  map = bookRepository.querySomeList("");
//		for (int i = 0; i < map.size(); i++) {
//			Users book = new Users();
//			book.setName(map.get(i).get("name").toString());
//			book.setId(Long.parseLong(map.get(i).get("id").toString()));
//			list.add(book);
//		}
//		return list;
//	}
//
//	@Transactional
//	@Override
//	public void save(Users book) {
//		
//		book =bookRepository.save(book);
//		throw new BusinessException("报错了");
//	}

}

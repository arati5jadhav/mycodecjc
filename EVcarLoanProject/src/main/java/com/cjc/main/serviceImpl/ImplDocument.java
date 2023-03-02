package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Document;
import com.cjc.main.repository.RepoDocument;
import com.cjc.main.service.SerDocument;

@Service
public class ImplDocument implements SerDocument{

		@Autowired
		RepoDocument rd;

		@Override
		public Document savedoc(Document alldoc) {
			
			rd.save(alldoc);
			return alldoc;
		}

		@Override
		public Iterable<Document> getDoc(int custid) {
			
			return rd.findAll();
		}


}

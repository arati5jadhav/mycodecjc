package com.cjc.main.service;

import com.cjc.main.model.Document;

public interface SerDocument {

	public Document savedoc(Document alldoc);

	public Iterable<Document> getDoc(int custid);


}

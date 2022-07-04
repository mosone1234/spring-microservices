package com.testproject.user.vm.Template;

import com.testproject.user.domain.User;
import com.testproject.user.vm.Store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ResponseTemplateVM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVM {

	private User user;
	private Store store;

}

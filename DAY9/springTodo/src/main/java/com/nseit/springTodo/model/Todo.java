package com.nseit.springTodo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Todo {
    int Id;
    String Task;
    boolean isCompleted;
}

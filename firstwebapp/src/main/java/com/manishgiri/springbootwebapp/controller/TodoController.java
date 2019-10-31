package com.manishgiri.springbootwebapp.controller;

import com.manishgiri.springbootwebapp.model.Todo;
import com.manishgiri.springbootwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService todoService;

    public TodoController() {
        System.out.println("Todo Controller constructor.");
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model) {
        model.put("todos", todoService.retrieveTodos((String) model.get("name")));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        model.addAttribute(new Todo(0, (String) model.get("name"), "Default Description", new Date(), false));
        return "todo";
    }

    /*@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(@RequestParam String desc, ModelMap model) {
        todoService.addTodo((String) model.get("name"), desc, new Date(), false);
        return "redirect:/list-todos";
    }*/

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, Todo todo) {
        todoService.addTodo((String) model.get("name"), todo.getDesc(), new Date(), false);
        return "redirect:/list-todos";
    }


    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteTodo(id);
        return "redirect:/list-todos";
    }
}

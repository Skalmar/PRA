package Project_2.queries;

import Project_2.model.Employees;
import Project_2.model.Projects;
import Project_2.model.PersonalInfo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class Queries {
    EntityManager entityManager;

    public Queries(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Employees> getEmployeesByName(String name) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.firstName LIKE :name", Employees.class);
        return query.setParameter("name", name).getResultList();
    }

    public List<Employees> getEmployeesBySurName(String surname) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.lastName LIKE :surname", Employees.class);
        return query.setParameter("surname", surname).getResultList();
    }

    public List<Employees> getEmployeesByPESEL(String PESEL) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.PESEL LIKE :PESEL", Employees.class);
        return query.setParameter("PESEL", PESEL).getResultList();
    }

    public List<Employees> getEmployeesById(int Id) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.id LIKE :Id", Employees.class);
        return query.setParameter("Id", Id).getResultList();
    }


    public List<Employees> getAllEmployeesByPage(int pagenr) {
        Query queryTotal = entityManager.createQuery
                ("Select count(f) from Employees f");
        long countResult = (long)queryTotal.getSingleResult();

        Query query = entityManager.createQuery("Select e FROM Employees e");

        int pageSize = 10;

        int pageNumber = (int) ((countResult / pageSize) + 1);

        if (pagenr > pageNumber) pagenr = pageNumber;
        query.setFirstResult((pagenr-1) * pageSize);
        query.setMaxResults(pageSize);

        return query.getResultList();
    }
}

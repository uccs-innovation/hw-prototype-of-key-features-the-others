using System.Collections.ObjectModel;
using Microsoft.Maui.Controls;
using System;

namespace StudyN_
{
    public class Event
    {
        string name;
        public string Name
        {
            get { return name; }
            set
            {
                name = value;
            }
        }

        public Event(string name)
        {
            this.Name = name;
        }
        public string Category { get; set; }
        public string EventType { get; set; }
        public string Description { get; set; }
        public DateTime EventDueDate { get; set; }
        public DateTime StartTime { get; set; }
        public DateTime StopTime { get; set; }
        public bool Complete { get; set; }
    }

    public class EventData
    {
        void GenerateEvents()
        {
            ObservableCollection<Event> result = new ObservableCollection<Event>();
            result.Add(
                new Event("Homework 1")
                {
                    EventDueDate = new DateTime(2022, 9, 22),
                    StartTime = new DateTime(2022, 9, 21, 3, 30, 0),
                    StopTime = new DateTime(2022, 9, 21, 4, 30, 0),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Homework 2")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 14),
                    StopTime = new DateTime(2022, 9, 14),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Homework 3")
                {
                    EventDueDate = new DateTime(2022, 9, 23),
                    StartTime = new DateTime(2022, 9, 21),
                    StopTime = new DateTime(2022, 9, 21),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Homework 4")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 1),
                    StopTime = new DateTime(2022, 9, 2),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Homework 5")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 17),
                    StopTime = new DateTime(2022, 9, 17),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = true
                }
            );
            result.Add(
                new Event("Homework 7")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 17, 8, 30, 0),
                    StopTime = new DateTime(2022, 9, 18, 2, 30, 0),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the homework feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Project 1")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 1),
                    StopTime = new DateTime(2022, 9, 1),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the project feature",
                    Complete = false
                }
            );
            result.Add(
                new Event("Project 2")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 5),
                    StopTime = new DateTime(2022, 9, 5),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the project feature",
                    Complete = true
                }
            );
            result.Add(
                new Event("Project 3")
                {
                    EventDueDate = new DateTime(2022, 9, 21),
                    StartTime = new DateTime(2022, 9, 15),
                    StopTime = new DateTime(2022, 9, 15),
                    Category = "CS4320",
                    EventType = "Homework",
                    Description = "This is a test of the project feature",
                    Complete = false
                }
            );
            Events = result;
        }

        public ObservableCollection<Event> Events { get; private set; }

        public EventData()
        {
            GenerateEvents();
        }
    }
}
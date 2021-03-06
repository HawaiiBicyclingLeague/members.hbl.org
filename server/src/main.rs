#![feature(proc_macro_hygiene, decl_macro)]

#[macro_use]
extern crate rocket;

use rocket::Response;
use rocket_contrib::templates::Template;
use std::collections::HashMap;
use rocket_contrib::serve::StaticFiles;

#[get("/")]
fn index() -> Template {
    let context: HashMap<&str, &str> = HashMap::new();
    Template::render("registration", &context)
}

fn main() {
    rocket::ignite()
        .mount("/", routes![index])
        .mount("/public", StaticFiles::from("static"))
        .attach(Template::fairing())
        .launch();
}
